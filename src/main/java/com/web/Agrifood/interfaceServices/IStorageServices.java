package com.web.Agrifood.interfaceServices;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

public interface IStorageServices {
	public String storeFile(MultipartFile file);
	public Stream<Path> loadAll();
	public byte[] readFileContent(String fileName);
	public void deleteAllFiles();
}
