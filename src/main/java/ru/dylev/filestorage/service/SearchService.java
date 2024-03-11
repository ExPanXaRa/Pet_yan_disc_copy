package ru.dylev.filestorage.service;

import ru.dylev.filestorage.dto.file.FileItemDto;

import java.util.List;

/**
 *  Defines methods to perform search operations in storage.
 */
public interface SearchService {

    List<FileItemDto> search(String query);
}
