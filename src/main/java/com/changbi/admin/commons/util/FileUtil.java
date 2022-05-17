package com.changbi.admin.commons.util;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

@Component
public class FileUtil {

    public static String accessKey;
    public static String secretKey;

    @Value("${cloud.ncp.credentials.access-key}")
    public void setAccessKey(String value){
        accessKey = value;
    }
    @Value("${cloud.ncp.credentials.secret-key}")
    public void setSecretKey(String value){
        secretKey = value;
    }


    public void test(){
        System.out.println("======fileUpload access-Key = " + accessKey + ", secret-key = " + secretKey);
    }

    public static BufferedImage imageResize(InputStream inputStream,
                                            int width,
                                            int height) throws Exception{

        //전송 이미지
        BufferedImage inputImage = ImageIO.read(inputStream);

        //리턴 이미지
        BufferedImage outputImage = new BufferedImage(width, height, inputImage.getType());

        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, width, height, null);
        g2d.dispose();

        return outputImage;
    }

    public static void fileUp(){

        final String endPoint = "https://kr.object.ncloudstorage.com";
        final String regionName = "kr-standard";
        final String accessKey = FileUtil.accessKey;
        final String secretKey = FileUtil.secretKey;

        System.out.println("======fileUpload access-Key = " + accessKey + ", secret-key = " + secretKey);


        // S3 client
        /*final AmazonS3 s3 = AmazonS3ClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endPoint, regionName))
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretKey)))
                .build();

        String bucketName = "changbi-dev";

        // create folder
        String folderName = "tem/";

        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(0L);
        objectMetadata.setContentType("application/x-directory");
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, folderName, new ByteArrayInputStream(new byte[0]), objectMetadata);

        try {
            s3.putObject(putObjectRequest);
            System.out.format("Folder %s has been created.\n", folderName);
        } catch (AmazonS3Exception e) {
            e.printStackTrace();
        } catch(SdkClientException e) {
            e.printStackTrace();
        }

        // upload local file
        String objectName = "sample-object";
        String filePath = "/tmp/sample.txt";

        try {
            s3.putObject(bucketName, objectName, new File(filePath));
            System.out.format("Object %s has been created.\n", objectName);
        } catch (AmazonS3Exception e) {
            e.printStackTrace();
        } catch(SdkClientException e) {
            e.printStackTrace();
        }*/
    }


}
