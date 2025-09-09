package com.jeffmmartins.qrcode.generator.infrastructure;

import com.jeffmmartins.qrcode.generator.ports.StoragePort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

//essa anotação é necessária para futuramente realizar a injeção
@Component
public class S3StorageAdapter implements StoragePort {
    private final S3Client s3Client;

    private final String bucketName;

    private final String region;

    //Anotação value recupera valores valores que estão no application.properties
    public S3StorageAdapter(@Value("${aws.region}") String region,
                            @Value("${aws.s3.buccket-name") String bucketName,
                            S3Client s3Client
                            ) {
        this.bucketName = bucketName;
        this.region = region;
        this.s3Client = S3Client.builder()
                .region(Region.of(this.region))
                .build();
    }

    @Override
    // aws trata tudo que é arquivo como um objeto.
    public String uploadFile(byte[] fileData, String fileName, String contentType) {
        //aqui é so a descrição
        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(fileName)//nome do arquivo que vai ser salvo
                .contentType(contentType)//tipo do conteudo nesse caso imagem do qrcode
                .build();//para montar o objeto
        //passa a descrição e o conteudo de fato que tem no objeto
        s3Client.putObject(putObjectRequest, RequestBody.fromBytes(fileData));
        //formato de acordo com aws monta as urls públicas do objeto.
        return String.format("https://%s.s3.%s.amazon.com./%s", bucketName, region, fileName);
    }
}
