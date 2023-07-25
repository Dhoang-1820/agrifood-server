package com.web.Agrifood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.web.Agrifood.interfaceServices.IStorageServices;
import com.web.Agrifood.model.ResponseObject;

@Controller
@RequestMapping(path = "/api/uploadfiles")
@CrossOrigin(origins = "http://localhost:3001")
public class UploadFilesController {
	
	@Autowired
	private IStorageServices storageServices;
	
	@PostMapping("")
	public ResponseEntity<ResponseObject> uploadFiles(@RequestBody() MultipartFile file) {
		try {
			// save file to a folder => use service
			String generateedFileName = storageServices.storeFile(file);
			return ResponseEntity.status(HttpStatus.OK).body(
						new ResponseObject("ok", "upload file successfully", generateedFileName)
					);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
					new ResponseObject("fail", e.getMessage(),"")
				);
		}	
	}
	
	//get image
	@GetMapping("/files/{fileName:.+}")
	public ResponseEntity<byte[]> readDetailFile(@PathVariable String fileName) {
		try {
			byte[] bytes = storageServices.readFileContent(fileName);
			return ResponseEntity
					.ok()
					.contentType(MediaType.IMAGE_JPEG)
					.body(bytes);
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
}
