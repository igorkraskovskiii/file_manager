package com.igorkraskovski.file.manager;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FileInfo {
    public enum FileType {
        FILE("F"), DIRECTORY("D");

        FileType(String name) {
            this.name = name;
        }

        private String name;
        private String fileName;
        private String typeFile;
        private long size;
        private LocalDateTime lastModified;

        public String getName() {
            return name;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getTypeFile() {
            return typeFile;
        }

        public void setTypeFile(String typeFile) {
            this.typeFile = typeFile;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public LocalDateTime getLastModified() {
            return lastModified;
        }

        public void setLastModified(LocalDateTime lastModified) {
            this.lastModified = lastModified;
        }

    }
}
