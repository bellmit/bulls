package com.goochou.p2b.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrairieArea implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prairie_area.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prairie_area.prairie_id
     *
     * @mbg.generated
     */
    private Long prairieId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prairie_area.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prairie_area.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prairie_area.sequence
     *
     * @mbg.generated
     */
    private Integer sequence;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prairie_area
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prairie_area.id
     *
     * @return the value of prairie_area.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prairie_area.id
     *
     * @param id the value for prairie_area.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prairie_area.prairie_id
     *
     * @return the value of prairie_area.prairie_id
     *
     * @mbg.generated
     */
    public Long getPrairieId() {
        return prairieId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prairie_area.prairie_id
     *
     * @param prairieId the value for prairie_area.prairie_id
     *
     * @mbg.generated
     */
    public void setPrairieId(Long prairieId) {
        this.prairieId = prairieId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prairie_area.name
     *
     * @return the value of prairie_area.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prairie_area.name
     *
     * @param name the value for prairie_area.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prairie_area.description
     *
     * @return the value of prairie_area.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prairie_area.description
     *
     * @param description the value for prairie_area.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prairie_area.sequence
     *
     * @return the value of prairie_area.sequence
     *
     * @mbg.generated
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prairie_area.sequence
     *
     * @param sequence the value for prairie_area.sequence
     *
     * @mbg.generated
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    
    //-------------------------------------------------------------------
    /*
     * PrairieArea 的所有point
     */
    private List<PrairieAreaPoint> prairieAreaPointList=new ArrayList<PrairieAreaPoint>();
	public List<PrairieAreaPoint> getPrairieAreaPointList() {
		return prairieAreaPointList;
	}
	public void setPrairieAreaPointList(List<PrairieAreaPoint> prairieAreaPointList) {
		this.prairieAreaPointList = prairieAreaPointList;
	}
    
	private Double maxLongitude;
	private Double minLongitude;
	private Double maxLatitude;
	private Double minLatitude;
	
	public boolean isEffectiveArea() {
		if(prairieAreaPointList==null || prairieAreaPointList.size()<3) {
			return false;
		}
		return true;
	}
	
	private void calculateRange() {
		if(!this.isEffectiveArea()) {
			return;
		}
		for(PrairieAreaPoint prairieAreaPoint:prairieAreaPointList) {
			if(maxLongitude==null || maxLongitude<prairieAreaPoint.getLongitude().doubleValue()) {
				maxLongitude=prairieAreaPoint.getLongitude().doubleValue();
			}
			if(minLongitude==null || maxLongitude>prairieAreaPoint.getLongitude().doubleValue()) {
				minLongitude=prairieAreaPoint.getLongitude().doubleValue();
			}
			if(maxLatitude==null || maxLatitude<prairieAreaPoint.getLatitude().doubleValue()) {
				maxLatitude=prairieAreaPoint.getLatitude().doubleValue();
			}
			if(minLatitude==null || minLatitude>prairieAreaPoint.getLatitude().doubleValue()) {
				minLatitude=prairieAreaPoint.getLatitude().doubleValue();
			}
		}
	}
	
	public Double getMaxLongitude() {
		if(maxLongitude==null) {
			synchronized (this) {
				if(maxLongitude==null) {
					calculateRange();
				}
			}
		}
		return maxLongitude;
	}

	public void setMaxLongitude(Double maxLongitude) {
		this.maxLongitude = maxLongitude;
	}

	public Double getMinLongitude() {
		if(minLongitude==null) {
			synchronized (this) {
				if(minLongitude==null) {
					calculateRange();
				}
			}
		}
		return minLongitude;
	}

	public void setMinLongitude(Double minLongitude) {
		this.minLongitude = minLongitude;
	}

	public Double getMaxLatitude() {
		if(maxLatitude==null) {
			synchronized (this) {
				if(maxLatitude==null) {
					calculateRange();
				}
			}
		}
		return maxLatitude;
	}

	public void setMaxLatitude(Double maxLatitude) {
		this.maxLatitude = maxLatitude;
	}

	public Double getMinLatitude() {
		if(minLatitude==null) {
			synchronized (this) {
				if(minLatitude==null) {
					calculateRange();
				}
			}
		}
		return minLatitude;
	}

	public void setMinLatitude(Double minLatitude) {
		this.minLatitude = minLatitude;
	}

}