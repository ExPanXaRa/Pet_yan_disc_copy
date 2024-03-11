package ru.dylev.filestorage.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Properties for Minio configuration.
 *
 * @see ru.dylev.filestorage.config.MinioConfiguration
 * @see ru.dylev.filestorage.config.handlers.MinioBucketHandler
 */
@Data
@Component
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    private String url;
    private String bucket;
    private String user;
    private String password;
}

