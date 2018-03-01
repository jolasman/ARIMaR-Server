package bim;

import java.util.ArrayList;
import java.util.List;

import org.geolatte.geom.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bimDao.Arm_tl_controller_repository;
import bimDao.Arm_tl_group_repository;
import bimDao.Arm_tl_plan_repository;
import bimDao.Arm_tl_step_group_repository;
import bimDao.Arm_tl_step_repository;
import bimDao.Arm_traffic_light_repository;
import bimDao.BimCrosswalksRepository;
import bimDao.BimEspirasRepository;
import bimDao.BimIntersectionRepository;
import gis.Points;
import main.DTO;

@RestController
@Component
public class BimController {

	@Autowired
	Arm_tl_controller_repository tl_controller_repository;

	@Autowired
	Arm_tl_group_repository tl_group_repository;

	@Autowired
	Arm_tl_plan_repository tl_plan_repository;

	@Autowired
	Arm_tl_step_group_repository tl_step_group_repository;

	@Autowired
	Arm_tl_step_repository  tl_step_repository;

	@Autowired
	Arm_traffic_light_repository traffic_light_repository;

	@Autowired
	BimCrosswalksRepository bim_crosswalks_repository;

	@Autowired
	BimIntersectionRepository bim_intersection_repository;

	@Autowired
	BimEspirasRepository bim_espiras_repository;


	//bim/find/controller?id=1
	@RequestMapping(value="bim/find/controller", method = RequestMethod.GET)
	public Object findByController(@RequestParam("id") long id){
		Arm_tl_Controller object = tl_controller_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (controller_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setTl__Controller_controller_id(object.getTl_controller_id());
		dtoObject.setCmp_longersection_id(object.getCmp_longersection_id());

		return dtoObject;
	}

	//bim/find/group?id=1
	@RequestMapping(value="bim/find/group", method = RequestMethod.GET)
	public Object findByGroup(@RequestParam("id") int id){
		Arm_tl_group object = tl_group_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (group_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setTl_group_id(object.getTl_group_id());
		dtoObject.setTl_Group_controller_id(object.getTl_controller_id());
		dtoObject.setGroup_value(object.getGroup_value());

		return dtoObject;
	}

	//bim/find/plan?id=1
	@RequestMapping(value="bim/find/plan", method = RequestMethod.GET)
	public Object findByPlan(@RequestParam("id") int id){
		Arm_tl_plan object = tl_plan_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (group_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setTl_plan_id(object.getTl_plan_id());
		dtoObject.setTl_Plan_controller_id(object.getTl_controller_id());
		dtoObject.setPlan_value(object.getPlan_value());
		dtoObject.setDuration(object.getDuration());

		return dtoObject;
	}

	//bim/find/step-group?id=1
	@RequestMapping(value="bim/find/step-group", method = RequestMethod.GET)
	public Object findByStepGroup(@RequestParam("id") int id){
		Arm_tl_step_group object = tl_step_group_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (group_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setTl_step_group_id(object.getTl_step_group_id());
		dtoObject.setTl_step_id(object.getTl_step_id());
		dtoObject.setTl_Step_Group_group_id(object.getTl_group_id());

		return dtoObject;
	}

	//bim/find/step?id=1
	@RequestMapping(value="bim/find/step", method = RequestMethod.GET)
	public Object findByStep(@RequestParam("id") int id){
		Arm_tl_Step object = tl_step_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (group_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setTl_Step_step_id(object.getTl_step_id());
		dtoObject.setTl_Step_controller_id(object.getTl_controller_id());
		dtoObject.setStep_value(object.getStep_value());
		dtoObject.setMax_step_time(object.getMax_step_time());

		return dtoObject;
	}

	//bim/find/traffic-light?id=1
	@RequestMapping(value="bim/find/traffic-light", method = RequestMethod.GET)
	public Object findByTrafficLight(@RequestParam("id") int id){
		Arm_traffic_light object = traffic_light_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (group_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setTraffic_light_id(object.getTraffic_light_id());
		dtoObject.setFeu(object.getFeu());
		dtoObject.setTys(object.getTys());
		dtoObject.setTl_Traffic_controller_id(object.getTl_controller_id());

		Position pos = object.getCoordinates().getPosition();	
		dtoObject.setCoordinatesX(pos.getCoordinate(0));
		dtoObject.setCoordinatesY(pos.getCoordinate(1));

		return dtoObject;
	}


	//bim/find/bim-crosswalks?id=1
	@RequestMapping(value="bim/find/bim-crosswalks", method = RequestMethod.GET)
	public Object findByBimCrosswalks(@RequestParam("id") int id){
		Bim_Crosswalks object = bim_crosswalks_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (group_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setBim_crosswalks_id(object.getBim_crosswalk_id());
		dtoObject.setBim_crosswalks_intersection_id(object.getBim_intersection_id());
		dtoObject.setBim_crosswalks_material_id(object.getCrosswalk_material_id());


		return dtoObject;
	}

	//bim/find/intersections?id=1
	@RequestMapping(value="bim/find/intersections", method = RequestMethod.GET)
	public Object findByIntersections(@RequestParam("id") int id){
		Bim_Intersection object = bim_intersection_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (intersection_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setBim_intersection_id(object.getBim_intersection_id());
		dtoObject.setBim_intersection_description(object.getBim_intersection_description());


		return dtoObject;
	}


	//bim/find/bim-espiras?id=1
	@RequestMapping(value="bim/find/bim-espiras", method = RequestMethod.GET)
	public Object findByBimEspiras(@RequestParam("id") int id){
		Bim_Espiras object = bim_espiras_repository.findOne(id);
		if(object == null) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (espira_id)";
		}
		// object conversion
		DTO dtoObject = new DTO();
		dtoObject.setBim_espiras_id(object.getEspiras_id());
		dtoObject.setBim_espiras_intersection_id(object.getIntersection_id());
		dtoObject.setBim_espiras_material_id(object.getMaterial_id());
		dtoObject.setBim_espiras_tipologia(object.getTipologia());

		return dtoObject;
	}


	
	//bim/find/bim-crosswalks/two/1/id1=1
	@RequestMapping(value="bim/find/bim-crosswalks/two/{id}/", method = RequestMethod.GET)
	public Object findByTwoCross(@PathVariable(value="id") int pathv, @RequestParam int id) {
		List<Bim_Crosswalks> object = bim_crosswalks_repository.findByTwo(pathv, id);
		if(object.isEmpty()) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (highway)";
		}
		List<DTO> objList = new ArrayList<DTO>();
		for(Bim_Crosswalks ob: object) {
			DTO dtoObject = new DTO();
			dtoObject.setBim_crosswalks_id(ob.getBim_crosswalk_id());
			dtoObject.setBim_crosswalks_intersection_id(ob.getBim_intersection_id());
			dtoObject.setBim_crosswalks_material_id(ob.getCrosswalk_material_id());
			objList.add(dtoObject);
		}
		return objList;
	}
	

}

/*//bim/find/bim-crosswalks/?id=1&id1=1
	@RequestMapping(value="bim/find/bim-crosswalks/two", method = RequestMethod.GET)
	public Object findByTwoCross(@RequestParam int id, @RequestParam int id1) {
		System.out.println(id + "   " + id1 + "\n\n");
		List<Bim_Crosswalks> object = bim_crosswalks_repository.findByTwo(id, id1);
		if(object.isEmpty()) {
			return "Nothing found! The value entered as id must be misspelt! Type it again. (highway)";
		}
		List<DTO> objList = new ArrayList<DTO>();
		for(Bim_Crosswalks ob: object) {
			DTO dtoObject = new DTO();
			dtoObject.setBim_crosswalks_id(ob.getBim_crosswalk_id());
			dtoObject.setBim_crosswalks_intersection_id(ob.getBim_intersection_id());
			dtoObject.setBim_crosswalks_material_id(ob.getCrosswalk_material_id());
			objList.add(dtoObject);
		}
		return objList;
	}*/
