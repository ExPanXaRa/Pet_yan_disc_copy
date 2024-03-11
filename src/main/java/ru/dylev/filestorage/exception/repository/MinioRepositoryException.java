package ru.dylev.filestorage.exception.repository;

/**
 * Parent exception for all {@link  ru.dylev.filestorage.repository.MinioRepository} related exceptions.
 */
public class MinioRepositoryException extends RuntimeException {

    public MinioRepositoryException(String message) {
        super(message);
    }

    public MinioRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public MinioRepositoryException(Throwable cause) {
        super(cause);
    }
}
