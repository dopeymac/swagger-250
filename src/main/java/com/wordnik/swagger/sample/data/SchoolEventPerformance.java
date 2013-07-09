package com.wordnik.swagger.sample.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "schoolEventPerformance")
@XmlAccessorType(XmlAccessType.FIELD)
public class SchoolEventPerformance {
  @XmlElement(name = "name")
  private String name;
  @XmlElement(name = "performanceMetric")
  private List<SchoolEventPerformanceMetric> performanceMetricList;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<SchoolEventPerformanceMetric> getPerformanceMetricList() {
    return performanceMetricList;
  }

  public void setPerformanceMetricList(
          List<SchoolEventPerformanceMetric> performanceMetricList) {
    this.performanceMetricList = performanceMetricList;
  }
}
