package com.performance.model;

public class TblGenerator {
    private Integer gid;

    private Integer moduleid;

    private String modulename;

    private String startorg;

    private String endorg;

    private Integer filenum;

    private Integer filesize;

    private String filebasepath;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getStartorg() {
        return startorg;
    }

    public void setStartorg(String startorg) {
        this.startorg = startorg == null ? null : startorg.trim();
    }

    public String getEndorg() {
        return endorg;
    }

    public void setEndorg(String endorg) {
        this.endorg = endorg == null ? null : endorg.trim();
    }

    public Integer getFilenum() {
        return filenum;
    }

    public void setFilenum(Integer filenum) {
        this.filenum = filenum;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getFilebasepath() {
        return filebasepath;
    }

    public void setFilebasepath(String filebasepath) {
        this.filebasepath = filebasepath == null ? null : filebasepath.trim();
    }
}