package com.wordnik.swagger.sample.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "school")
@XmlAccessorType(XmlAccessType.FIELD)
public class School {
  public static final String INTERVAL_ALL = "all";
  public static final String INTERVAL_DAY = "day";

  @XmlElement(name = "channelId")
  private long channelId;
  @XmlElement(name = "channelName")
  private String channelName;
  @XmlElement(name = "schoolPerformance")
  List<SchoolPerformance> schoolPerformanceList;
  
  
  private Map<String, String> map;

  
  public Map<? extends Object, String> getMap() {
    return map;
  }

  public void setMap(Map<? extends Object, String> map) {
    this.map = new HashMap<String, String>();
    for (Map.Entry<? extends Object, String> entry : map.entrySet()) {
      this.map.put(entry.getKey().toString(), entry.getValue());
    }
  }

  public long getChannelId() {
    return channelId;
  }

  public void setChannelId(long channelId) {
    this.channelId = channelId;
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public List<SchoolPerformance> getSchoolPerformanceList() {
    return schoolPerformanceList;
  }

  public void setSchoolPerformanceList(
          List<SchoolPerformance> schoolPerformanceList) {
    this.schoolPerformanceList = schoolPerformanceList;
  }
}
