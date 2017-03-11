package io.egen.api.entity;

import java.sql.Timestamp;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * @author mayurnayak
 * "city": "Chicago",
  "description": "scattered clouds",
  "humidity": 33,
  "pressure": 1020,
  "temperature": 25,
  "wind": {
    "speed": 3.1,
    "degree": 240
  },
  "timestamp": "2017-02-14T05:48:41.861Z"
 *
 */

@Entity
public class Weather {
	@Id
	private String city;
	private String description;
	private Integer humidity;
	private Integer pressure;
	private Integer temperature;
	@Embedded
	private Wind wind;
	private Timestamp time;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getHumidity() {
		return humidity;
	}
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public Integer getPressure() {
		return pressure;
	}
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
}
