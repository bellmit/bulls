package com.goochou.p2b.model;

import com.goochou.p2b.hessian.openapi.farmcloud.druidtech.GpsInfo;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Date;

public class TrackDevice implements Serializable {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.id
	 * @mbg.generated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.updated_at
	 * @mbg.generated
	 */
	private String updated_at;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.uuid
	 * @mbg.generated
	 */
	private String uuid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.device_type
	 * @mbg.generated
	 */
	private String device_type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.hardware_version
	 * @mbg.generated
	 */
	private String hardware_version;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.firmware_version
	 * @mbg.generated
	 */
	private String firmware_version;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.company_id
	 * @mbg.generated
	 */
	private String company_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.company_name
	 * @mbg.generated
	 */
	private String company_name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.imsi
	 * @mbg.generated
	 */
	private String imsi;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.iccid
	 * @mbg.generated
	 */
	private String iccid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.sim_number
	 * @mbg.generated
	 */
	private String sim_number;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.mac
	 * @mbg.generated
	 */
	private String mac;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.mark
	 * @mbg.generated
	 */
	private String mark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.battery_voltage
	 * @mbg.generated
	 */
	private String battery_voltage;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.temperature
	 * @mbg.generated
	 */
	private String temperature;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.survive
	 * @mbg.generated
	 */
	private String survive;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.stock_time
	 * @mbg.generated
	 */
	private String stock_time;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.status
	 * @mbg.generated
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.signal_strength
	 * @mbg.generated
	 */
	private String signal_strength;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.bit_error_rate
	 * @mbg.generated
	 */
	private String bit_error_rate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.radio_access_technology
	 * @mbg.generated
	 */
	private String radio_access_technology;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.network_operator
	 * @mbg.generated
	 */
	private String network_operator;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.gps_signal_strength
	 * @mbg.generated
	 */
	private String gps_signal_strength;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.battery_power
	 * @mbg.generated
	 */
	private String battery_power;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.longitude
	 * @mbg.generated
	 */
	private String longitude;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.latitude
	 * @mbg.generated
	 */
	private String latitude;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.point_location
	 * @mbg.generated
	 */
	private String point_location;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.location_timestamp
	 * @mbg.generated
	 */
	private String location_timestamp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.beh_timestamp
	 * @mbg.generated
	 */
	private String beh_timestamp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.sync_at
	 * @mbg.generated
	 */
	private Date sync_at;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.sn
	 * @mbg.generated
	 */
	private String sn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.nickname
	 * @mbg.generated
	 */
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_track_device.is_virtual
	 * @mbg.generated
	 */
	private Boolean is_virtual;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_track_device
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.id
	 * @return  the value of t_track_device.id
	 * @mbg.generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.id
	 * @param id  the value for t_track_device.id
	 * @mbg.generated
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.updated_at
	 * @return  the value of t_track_device.updated_at
	 * @mbg.generated
	 */
	public String getUpdated_at() {
		return updated_at;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.updated_at
	 * @param updated_at  the value for t_track_device.updated_at
	 * @mbg.generated
	 */
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.uuid
	 * @return  the value of t_track_device.uuid
	 * @mbg.generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.uuid
	 * @param uuid  the value for t_track_device.uuid
	 * @mbg.generated
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.device_type
	 * @return  the value of t_track_device.device_type
	 * @mbg.generated
	 */
	public String getDevice_type() {
		return device_type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.device_type
	 * @param device_type  the value for t_track_device.device_type
	 * @mbg.generated
	 */
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.hardware_version
	 * @return  the value of t_track_device.hardware_version
	 * @mbg.generated
	 */
	public String getHardware_version() {
		return hardware_version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.hardware_version
	 * @param hardware_version  the value for t_track_device.hardware_version
	 * @mbg.generated
	 */
	public void setHardware_version(String hardware_version) {
		this.hardware_version = hardware_version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.firmware_version
	 * @return  the value of t_track_device.firmware_version
	 * @mbg.generated
	 */
	public String getFirmware_version() {
		return firmware_version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.firmware_version
	 * @param firmware_version  the value for t_track_device.firmware_version
	 * @mbg.generated
	 */
	public void setFirmware_version(String firmware_version) {
		this.firmware_version = firmware_version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.company_id
	 * @return  the value of t_track_device.company_id
	 * @mbg.generated
	 */
	public String getCompany_id() {
		return company_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.company_id
	 * @param company_id  the value for t_track_device.company_id
	 * @mbg.generated
	 */
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.company_name
	 * @return  the value of t_track_device.company_name
	 * @mbg.generated
	 */
	public String getCompany_name() {
		return company_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.company_name
	 * @param company_name  the value for t_track_device.company_name
	 * @mbg.generated
	 */
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.imsi
	 * @return  the value of t_track_device.imsi
	 * @mbg.generated
	 */
	public String getImsi() {
		return imsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.imsi
	 * @param imsi  the value for t_track_device.imsi
	 * @mbg.generated
	 */
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.iccid
	 * @return  the value of t_track_device.iccid
	 * @mbg.generated
	 */
	public String getIccid() {
		return iccid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.iccid
	 * @param iccid  the value for t_track_device.iccid
	 * @mbg.generated
	 */
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.sim_number
	 * @return  the value of t_track_device.sim_number
	 * @mbg.generated
	 */
	public String getSim_number() {
		return sim_number;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.sim_number
	 * @param sim_number  the value for t_track_device.sim_number
	 * @mbg.generated
	 */
	public void setSim_number(String sim_number) {
		this.sim_number = sim_number;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.mac
	 * @return  the value of t_track_device.mac
	 * @mbg.generated
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.mac
	 * @param mac  the value for t_track_device.mac
	 * @mbg.generated
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.mark
	 * @return  the value of t_track_device.mark
	 * @mbg.generated
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.mark
	 * @param mark  the value for t_track_device.mark
	 * @mbg.generated
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.battery_voltage
	 * @return  the value of t_track_device.battery_voltage
	 * @mbg.generated
	 */
	public String getBattery_voltage() {
		return battery_voltage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.battery_voltage
	 * @param battery_voltage  the value for t_track_device.battery_voltage
	 * @mbg.generated
	 */
	public void setBattery_voltage(String battery_voltage) {
		this.battery_voltage = battery_voltage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.temperature
	 * @return  the value of t_track_device.temperature
	 * @mbg.generated
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.temperature
	 * @param temperature  the value for t_track_device.temperature
	 * @mbg.generated
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.survive
	 * @return  the value of t_track_device.survive
	 * @mbg.generated
	 */
	public String getSurvive() {
		return survive;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.survive
	 * @param survive  the value for t_track_device.survive
	 * @mbg.generated
	 */
	public void setSurvive(String survive) {
		this.survive = survive;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.stock_time
	 * @return  the value of t_track_device.stock_time
	 * @mbg.generated
	 */
	public String getStock_time() {
		return stock_time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.stock_time
	 * @param stock_time  the value for t_track_device.stock_time
	 * @mbg.generated
	 */
	public void setStock_time(String stock_time) {
		this.stock_time = stock_time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.status
	 * @return  the value of t_track_device.status
	 * @mbg.generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.status
	 * @param status  the value for t_track_device.status
	 * @mbg.generated
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.signal_strength
	 * @return  the value of t_track_device.signal_strength
	 * @mbg.generated
	 */
	public String getSignal_strength() {
		return signal_strength;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.signal_strength
	 * @param signal_strength  the value for t_track_device.signal_strength
	 * @mbg.generated
	 */
	public void setSignal_strength(String signal_strength) {
		this.signal_strength = signal_strength;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.bit_error_rate
	 * @return  the value of t_track_device.bit_error_rate
	 * @mbg.generated
	 */
	public String getBit_error_rate() {
		return bit_error_rate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.bit_error_rate
	 * @param bit_error_rate  the value for t_track_device.bit_error_rate
	 * @mbg.generated
	 */
	public void setBit_error_rate(String bit_error_rate) {
		this.bit_error_rate = bit_error_rate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.radio_access_technology
	 * @return  the value of t_track_device.radio_access_technology
	 * @mbg.generated
	 */
	public String getRadio_access_technology() {
		return radio_access_technology;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.radio_access_technology
	 * @param radio_access_technology  the value for t_track_device.radio_access_technology
	 * @mbg.generated
	 */
	public void setRadio_access_technology(String radio_access_technology) {
		this.radio_access_technology = radio_access_technology;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.network_operator
	 * @return  the value of t_track_device.network_operator
	 * @mbg.generated
	 */
	public String getNetwork_operator() {
		return network_operator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.network_operator
	 * @param network_operator  the value for t_track_device.network_operator
	 * @mbg.generated
	 */
	public void setNetwork_operator(String network_operator) {
		this.network_operator = network_operator;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.gps_signal_strength
	 * @return  the value of t_track_device.gps_signal_strength
	 * @mbg.generated
	 */
	public String getGps_signal_strength() {
		return gps_signal_strength;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.gps_signal_strength
	 * @param gps_signal_strength  the value for t_track_device.gps_signal_strength
	 * @mbg.generated
	 */
	public void setGps_signal_strength(String gps_signal_strength) {
		this.gps_signal_strength = gps_signal_strength;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.battery_power
	 * @return  the value of t_track_device.battery_power
	 * @mbg.generated
	 */
	public String getBattery_power() {
		return battery_power;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.battery_power
	 * @param battery_power  the value for t_track_device.battery_power
	 * @mbg.generated
	 */
	public void setBattery_power(String battery_power) {
		this.battery_power = battery_power;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.longitude
	 * @return  the value of t_track_device.longitude
	 * @mbg.generated
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.longitude
	 * @param longitude  the value for t_track_device.longitude
	 * @mbg.generated
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.latitude
	 * @return  the value of t_track_device.latitude
	 * @mbg.generated
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.latitude
	 * @param latitude  the value for t_track_device.latitude
	 * @mbg.generated
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.point_location
	 * @return  the value of t_track_device.point_location
	 * @mbg.generated
	 */
	public String getPoint_location() {
		return point_location;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.point_location
	 * @param point_location  the value for t_track_device.point_location
	 * @mbg.generated
	 */
	public void setPoint_location(String point_location) {
		this.point_location = point_location;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.location_timestamp
	 * @return  the value of t_track_device.location_timestamp
	 * @mbg.generated
	 */
	public String getLocation_timestamp() {
		return location_timestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.location_timestamp
	 * @param location_timestamp  the value for t_track_device.location_timestamp
	 * @mbg.generated
	 */
	public void setLocation_timestamp(String location_timestamp) {
		this.location_timestamp = location_timestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.beh_timestamp
	 * @return  the value of t_track_device.beh_timestamp
	 * @mbg.generated
	 */
	public String getBeh_timestamp() {
		return beh_timestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.beh_timestamp
	 * @param beh_timestamp  the value for t_track_device.beh_timestamp
	 * @mbg.generated
	 */
	public void setBeh_timestamp(String beh_timestamp) {
		this.beh_timestamp = beh_timestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.sync_at
	 * @return  the value of t_track_device.sync_at
	 * @mbg.generated
	 */
	public Date getSync_at() {
		return sync_at;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.sync_at
	 * @param sync_at  the value for t_track_device.sync_at
	 * @mbg.generated
	 */
	public void setSync_at(Date sync_at) {
		this.sync_at = sync_at;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.sn
	 * @return  the value of t_track_device.sn
	 * @mbg.generated
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.sn
	 * @param sn  the value for t_track_device.sn
	 * @mbg.generated
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.nickname
	 * @return  the value of t_track_device.nickname
	 * @mbg.generated
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.nickname
	 * @param nickname  the value for t_track_device.nickname
	 * @mbg.generated
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_track_device.is_virtual
	 * @return  the value of t_track_device.is_virtual
	 * @mbg.generated
	 */
	public Boolean getIs_virtual() {
		return is_virtual;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_track_device.is_virtual
	 * @param is_virtual  the value for t_track_device.is_virtual
	 * @mbg.generated
	 */
	public void setIs_virtual(Boolean is_virtual) {
		this.is_virtual = is_virtual;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TrackDevice other = (TrackDevice) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    private GpsInfo status_gps;

    public GpsInfo getStatus_gps() {
        return status_gps;
    }

    public void setStatus_gps(GpsInfo status_gps) {
        this.latitude= status_gps.getLatitude();
        this.longitude= status_gps.getLongitude();
        this.status_gps = status_gps;
    }

    @Override
    public String toString() {
        return "TrackDevice{" +
                "id='" + id + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", uuid='" + uuid + '\'' +
                ", device_type='" + device_type + '\'' +
                ", hardware_version='" + hardware_version + '\'' +
                ", firmware_version='" + firmware_version + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_name='" + company_name + '\'' +
                ", imsi='" + imsi + '\'' +
                ", iccid='" + iccid + '\'' +
                ", sim_number='" + sim_number + '\'' +
                ", mac='" + mac + '\'' +
                ", mark='" + mark + '\'' +
                ", battery_voltage='" + battery_voltage + '\'' +
                ", temperature='" + temperature + '\'' +
                ", survive='" + survive + '\'' +
                ", stock_time='" + stock_time + '\'' +
                ", status='" + status + '\'' +
                ", signal_strength='" + signal_strength + '\'' +
                ", bit_error_rate='" + bit_error_rate + '\'' +
                ", radio_access_technology='" + radio_access_technology + '\'' +
                ", network_operator='" + network_operator + '\'' +
                ", gps_signal_strength='" + gps_signal_strength + '\'' +
                ", battery_power='" + battery_power + '\'' +
                ", longitude='" + getLongitude() + '\'' +
                ", latitude='" + getLatitude() + '\'' +
                ", point_location='" + point_location + '\'' +
                ", location_timestamp='" + location_timestamp + '\'' +
                ", beh_timestamp='" + beh_timestamp + '\'' +
                ", sync_at=" + sync_at +
                ", sn='" + sn + '\'' +
                ", nickname='" + nickname + '\'' +
                ", status_gps=" + status_gps +
                '}';
    }
}
