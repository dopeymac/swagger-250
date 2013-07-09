package com.wordnik.swagger.sample.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "schoolPerformance")
@XmlAccessorType(XmlAccessType.FIELD)
public class SchoolPerformance {
  @XmlElement(name = "datetimeBegin")
  private Date beginDate;
  @XmlElement(name = "datetimeEnd")
  private Date endDate;
  @XmlElement(name = "eventTotal")
  private Long eventTotal;
  @XmlElement(name = "conversionRate")
  private Double conversionRate;
  @XmlElement(name = "schoolEventPerformance")
  List<SchoolEventPerformance> eventPerformanceList;

  public Date getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(Date beginDate) {
    this.beginDate = beginDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Long getEventTotal() {
    return eventTotal;
  }

  public void setEventTotal(Long eventTotal) {
    this.eventTotal = eventTotal;
  }

  public Double getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Double clickRate) {
    this.conversionRate = clickRate;
  }

  public List<SchoolEventPerformance> getEventPerformanceList() {
    return eventPerformanceList;
  }

  public void setEventPerformanceList(
          List<SchoolEventPerformance> eventPerformanceList) {
    this.eventPerformanceList = eventPerformanceList;
  }
}
