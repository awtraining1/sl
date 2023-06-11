package com.ecommerce;

import java.io.*;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadDownloadController {

	@PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	@ResponseBody
	public String fileUpload(@RequestParam("fileToUpload") MultipartFile file) {
		String result = "File was uploaded successfully";

		try {
			File convertFile = new File("C:/tmp/" + file.getOriginalFilename());
			convertFile.createNewFile();
			
			FileOutputStream fout = new FileOutputStream(convertFile);
			fout.write(file.getBytes());
			fout.close();

		} catch (IOException iex) {
			result = "Error " + iex.getMessage();
		}

		return result;
	}

}
