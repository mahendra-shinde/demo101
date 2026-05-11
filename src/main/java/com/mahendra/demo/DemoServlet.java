package com.mahendra.demo;


public class DemoServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        // Handle POST request
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        // upload file to azure blob storage
        String fileName = request.getParameter("fileName");
        String fileContent = request.getParameter("fileContent");
        // Code to upload fileContent to Azure Blob Storage with the name fileName
        
        com.azure.storage.blob.BlobServiceClient blobServiceClient = new com.azure.storage.blob.BlobServiceClientBuilder().connectionString("").buildClient();
        com.azure.storage.blob.BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient("files");
    }
}   