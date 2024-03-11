package ru.dylev.filestorage.exception.repository;

/**
 * Exception produced by {@link ru.dylev.filestorage.repository.MinioRepository} when
 * {@link io.minio.MinioClient} throws any exception when trying to put an object to storage.
 * This exception serves as wrapper for these exceptions.
 *
 * @see ru.dylev.filestorage.repository.MinioRepository
 * @see io.minio.MinioClient
 */
public class PutObjectException extends MinioRepositoryException {

    public PutObjectException(String message) {
        super(message);
    }

    public PutObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public PutObjectException(Throwable cause) {
        super(cause);
    }
}
