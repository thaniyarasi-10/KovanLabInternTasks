package com.kovan.fileioandserialization.controller;


import com.kovan.fileioandserialization.service.FileListingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileListingController {
    private FileListingService fileListingService;
    public FileListingController(FileListingService fileListingService){
        this.fileListingService = fileListingService;
    }

    @GetMapping("/ListOfFiles")
    public List<String> getFileList(){
        return fileListingService.listOfAllFiles("D:\\program\\java\\Kovan Learnings\\kovanlabinterntasks\\dataandconcepts\\src\\main\\java");
    }
}
// http://localhost:8080/ListOfFiles
