package com.wordnik.swagger.sample.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "performanceMetric")
@XmlAccessorType(XmlAccessType.FIELD)
public class SchoolEventPerformanceMetric {
  @XmlElement(name = "name")
  private String name;
  @XmlElement(name = "rawCount")
  private Long rawCount;
  @XmlElement(name = "rate")
  private Double rate;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getRawCount() {
    return rawCount;
  }

  public void setRawCount(Long rawCount) {
    this.rawCount = rawCount;
  }

  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }
}
