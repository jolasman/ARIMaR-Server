package main;

import com.vividsolutions.jts.geom.CoordinateSequence;
import com.vividsolutions.jts.geom.Point;

public class DTO{

	//points
	private long osm_id;	
	private String amenity;
	private String highway;
	private String tags;
	private double wayX; 
	private double wayY;

	//tl_controller
	private long tl__Controller_controller_id;
	private long cmp_longersection_id;

	//tl_group
	private int tl_group_id;
	private int tl_Group_controller_id;
	private int group_value;

	//tl_plan
	private int tl_plan_id;
	private long tl_Plan_controller_id;
	private int plan_value;
	private int duration;

	//tl_step_group
	private int tl_step_group_id;
	private int tl_step_id;
	private int tl_Step_Group_group_id;

	//tl_step
	private int tl_Step_step_id;
	private int tl_Step_controller_id;
	private int step_value;
	private int max_step_time;

	//traffic_light
	private int traffic_light_id;
	private int feu;
	private int tys;
	private Integer type;
	private int tl_Traffic_controller_id;
	private double coordinatesX; 
	private double coordinatesY;
	private int signal_Orientation;

	//gis_crosswalks
	private int gis_crosswalks_id;
	private int gis_crosswalks_intersection_id;
	private double gis_crosswalk_coordinatesX;
	private double gis_crosswalk_coordinatesY;
	
	//bim_crosswalks
	private int bim_crosswalks_id;
	private int bim_crosswalks_intersection_id;
	private String bim_crosswalks_material_id;
	
	//bim_intersection
	private int bim_intersection_id;
	private String bim_intersection_description;
	
	//gis_espiras
	private int gis_espiras_id;
	private int gis_espiras_intersection_id;
	private double gis_espiras_coordinatesX;
	private double gis_espiras_coordinatesY;

	//bim_Espiras
	private int bim_espiras_id;
	private int bim_espiras_intersection_id;
	private String bim_espiras_material_id;
	private String bim_espiras_tipologia;
	
	//bim materials
	private int bim_materials_id;
	private String materials_name;
	private String materials_description;
	private double materials_cost;
	

    /**
     *  empty contructor
     */
	public DTO () {}


	/**
	 *  planet_osm_point --> GIS SIDE CONSTRUCTOR
	 * @param osm_id
	 * @param amenity
	 * @param highway
	 * @param tags
	 * @param way
	 */
	public DTO(long osm_id, String amenity, String highway, String tags, Point way){ 
		this.osm_id = osm_id;
		this.amenity = amenity;
		this.highway = highway;
		// coordinates conversion
		CoordinateSequence pos = way.getCoordinateSequence();		
		this.wayX = pos.getCoordinate(0).x;
		this.wayY = pos.getCoordinate(0).y;	

	}



	//getters and setters
	public long getOsm_id() {
		return osm_id;
	}

	public void setOsm_id(long osm_id) {
		this.osm_id = osm_id;
	}

	public String getAmenity() {
		return amenity;
	}

	public void setAmenity(String amenity) {
		this.amenity = amenity;
	}

	public String getHighway() {
		return highway;
	}

	public void setHighway(String highway) {
		this.highway = highway;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public double getWayX() {
		return wayX;
	}

	public void setWayX(double wayX) {
		this.wayX = wayX;
	}

	public double getWayY() {
		return wayY;
	}

	public void setWayY(double wayY) {
		this.wayY = wayY;
	}


	public long getTl__Controller_controller_id() {
		return tl__Controller_controller_id;
	}


	public void setTl__Controller_controller_id(long tl__Controller_controller_id) {
		this.tl__Controller_controller_id = tl__Controller_controller_id;
	}


	public long getCmp_longersection_id() {
		return cmp_longersection_id;
	}


	public void setCmp_longersection_id(long cmp_longersection_id) {
		this.cmp_longersection_id = cmp_longersection_id;
	}


	public int getTl_group_id() {
		return tl_group_id;
	}


	public void setTl_group_id(int tl_group_id) {
		this.tl_group_id = tl_group_id;
	}


	public int getTl_Group_controller_id() {
		return tl_Group_controller_id;
	}


	public void setTl_Group_controller_id(int tl_Group_controller_id) {
		this.tl_Group_controller_id = tl_Group_controller_id;
	}


	public int getGroup_value() {
		return group_value;
	}


	public void setGroup_value(int group_value) {
		this.group_value = group_value;
	}


	public int getTl_plan_id() {
		return tl_plan_id;
	}


	public void setTl_plan_id(int tl_plan_id) {
		this.tl_plan_id = tl_plan_id;
	}


	public long getTl_Plan_controller_id() {
		return tl_Plan_controller_id;
	}


	public void setTl_Plan_controller_id(long tl_Plan_controller_id) {
		this.tl_Plan_controller_id = tl_Plan_controller_id;
	}


	public int getPlan_value() {
		return plan_value;
	}


	public void setPlan_value(int plan_value) {
		this.plan_value = plan_value;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public int getTl_step_group_id() {
		return tl_step_group_id;
	}


	public void setTl_step_group_id(int tl_step_group_id) {
		this.tl_step_group_id = tl_step_group_id;
	}


	public int getTl_step_id() {
		return tl_step_id;
	}


	public void setTl_step_id(int tl_step_id) {
		this.tl_step_id = tl_step_id;
	}


	public int getTl_Step_Group_group_id() {
		return tl_Step_Group_group_id;
	}


	public void setTl_Step_Group_group_id(int tl_Step_Group_group_id) {
		this.tl_Step_Group_group_id = tl_Step_Group_group_id;
	}


	public int getTl_Step_step_id() {
		return tl_Step_step_id;
	}


	public void setTl_Step_step_id(int tl_Step_step_id) {
		this.tl_Step_step_id = tl_Step_step_id;
	}


	public int getTl_Step_controller_id() {
		return tl_Step_controller_id;
	}


	public void setTl_Step_controller_id(int tl_Step_controller_id) {
		this.tl_Step_controller_id = tl_Step_controller_id;
	}


	public int getStep_value() {
		return step_value;
	}


	public void setStep_value(int step_value) {
		this.step_value = step_value;
	}


	public int getMax_step_time() {
		return max_step_time;
	}


	public void setMax_step_time(int max_step_time) {
		this.max_step_time = max_step_time;
	}


	public int getTraffic_light_id() {
		return traffic_light_id;
	}


	public void setTraffic_light_id(int traffic_light_id) {
		this.traffic_light_id = traffic_light_id;
	}


	public int getFeu() {
		return feu;
	}


	public void setFeu(int feu) {
		this.feu = feu;
	}


	public int getTys() {
		return tys;
	}


	public void setTys(int tys) {
		this.tys = tys;
	}


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}


	public int getTl_Traffic_controller_id() {
		return tl_Traffic_controller_id;
	}


	public void setTl_Traffic_controller_id(int tl_Traffic_controller_id) {
		this.tl_Traffic_controller_id = tl_Traffic_controller_id;
	}


	public double getCoordinatesX() {
		return coordinatesX;
	}


	public void setCoordinatesX(double coordinatesX) {
		this.coordinatesX = coordinatesX;
	}


	public double getCoordinatesY() {
		return coordinatesY;
	}


	public void setCoordinatesY(double coordinatesY) {
		this.coordinatesY = coordinatesY;
	}

	
	public int getSignal_Orientation() {
		return signal_Orientation;
	}


	public void setSignal_Orientation(int signal_Orientation) {
		this.signal_Orientation = signal_Orientation;
	}


	public int getGis_crosswalks_id() {
		return gis_crosswalks_id;
	}


	public void setGis_crosswalks_id(int gis_crosswalks_id) {
		this.gis_crosswalks_id = gis_crosswalks_id;
	}


	public int getGis_crosswalks_intersection_id() {
		return gis_crosswalks_intersection_id;
	}


	public void setGis_crosswalks_intersection_id(int gis_crosswalks_intersection_id) {
		this.gis_crosswalks_intersection_id = gis_crosswalks_intersection_id;
	}


	public double getGis_crosswalk_coordinatesX() {
		return gis_crosswalk_coordinatesX;
	}


	public void setGis_crosswalk_coordinatesX(double gis_crosswalk_coordinatesX) {
		this.gis_crosswalk_coordinatesX = gis_crosswalk_coordinatesX;
	}


	public double getGis_crosswalk_coordinatesY() {
		return gis_crosswalk_coordinatesY;
	}


	public void setGis_crosswalk_coordinatesY(double gis_crosswalk_coordinatesY) {
		this.gis_crosswalk_coordinatesY = gis_crosswalk_coordinatesY;
	}


	public int getBim_crosswalks_id() {
		return bim_crosswalks_id;
	}


	public void setBim_crosswalks_id(int bim_crosswalks_id) {
		this.bim_crosswalks_id = bim_crosswalks_id;
	}


	public int getBim_crosswalks_intersection_id() {
		return bim_crosswalks_intersection_id;
	}


	public void setBim_crosswalks_intersection_id(int bim_crosswalks_intersection_id) {
		this.bim_crosswalks_intersection_id = bim_crosswalks_intersection_id;
	}


	public String getBim_crosswalks_material_id() {
		return bim_crosswalks_material_id;
	}


	public void setBim_crosswalks_material_id(String bim_crosswalks_material_id) {
		this.bim_crosswalks_material_id = bim_crosswalks_material_id;
	}


	public int getBim_intersection_id() {
		return bim_intersection_id;
	}


	public void setBim_intersection_id(int bim_intersection_id) {
		this.bim_intersection_id = bim_intersection_id;
	}


	public String getBim_intersection_description() {
		return bim_intersection_description;
	}


	public void setBim_intersection_description(String bim_intersection_description) {
		this.bim_intersection_description = bim_intersection_description;
	}


	public int getGis_espiras_id() {
		return gis_espiras_id;
	}


	public void setGis_espiras_id(int gis_espiras_id) {
		this.gis_espiras_id = gis_espiras_id;
	}


	public int getGis_espiras_intersection_id() {
		return gis_espiras_intersection_id;
	}


	public void setGis_espiras_intersection_id(int gis_espiras_intersection_id) {
		this.gis_espiras_intersection_id = gis_espiras_intersection_id;
	}


	public double getGis_espiras_coordinatesX() {
		return gis_espiras_coordinatesX;
	}


	public void setGis_espiras_coordinatesX(double gis_espiras_coordinatesX) {
		this.gis_espiras_coordinatesX = gis_espiras_coordinatesX;
	}


	public double getGis_espiras_coordinatesY() {
		return gis_espiras_coordinatesY;
	}


	public void setGis_espiras_coordinatesY(double gis_espiras_coordinatesY) {
		this.gis_espiras_coordinatesY = gis_espiras_coordinatesY;
	}


	public int getBim_espiras_id() {
		return bim_espiras_id;
	}


	public void setBim_espiras_id(int bim_espiras_id) {
		this.bim_espiras_id = bim_espiras_id;
	}


	public int getBim_espiras_intersection_id() {
		return bim_espiras_intersection_id;
	}


	public void setBim_espiras_intersection_id(int bim_espiras_intersection_id) {
		this.bim_espiras_intersection_id = bim_espiras_intersection_id;
	}


	public String getBim_espiras_material_id() {
		return bim_espiras_material_id;
	}


	public void setBim_espiras_material_id(String bim_espiras_material_id) {
		this.bim_espiras_material_id = bim_espiras_material_id;
	}


	public String getBim_espiras_tipologia() {
		return bim_espiras_tipologia;
	}


	public void setBim_espiras_tipologia(String bim_espiras_tipologia) {
		this.bim_espiras_tipologia = bim_espiras_tipologia;
	}


	public int getBim_materials_id() {
		return bim_materials_id;
	}


	public void setBim_materials_id(int bim_materials_id) {
		this.bim_materials_id = bim_materials_id;
	}


	public String getMaterials_name() {
		return materials_name;
	}


	public void setMaterials_name(String materials_name) {
		this.materials_name = materials_name;
	}


	public String getMaterials_description() {
		return materials_description;
	}


	public void setMaterials_description(String materials_description) {
		this.materials_description = materials_description;
	}


	public double getMaterials_cost() {
		return materials_cost;
	}


	public void setMaterials_cost(double materials_cost) {
		this.materials_cost = materials_cost;
	}
	
	

}
