/**
 * 
 *
 */

package io.mosip.kernel.masterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mosip.kernel.masterdata.dto.MachineHistoryDto;
import io.mosip.kernel.masterdata.service.MachineHistoryService;

/**
 * Controller with api to get Machine History Details
 * 
 * @author Megha Tanga
 * @since 1.0.0
 *
 */

@RestController
@RequestMapping(value = "/machineshistory")
public class MachineHistoryController {

	@Autowired
	private MachineHistoryService macHistoryService;

	/**
	 * Get api to fetch a machine history details based on given Machine ID,
	 * Language code and effective date time
	 * 
	 * @param id
	 *            machine Id
	 * @param languagecode
	 *            Language Code
	 * 
	 * @return returning machine history detail based on given Machine ID, Language
	 *         code and effective date time
	 */
	@GetMapping(value = "/{id}/{languagecode}/{effdatetimes}")
	public List<MachineHistoryDto> getMachineHistoryIdLangEff(@PathVariable("id") String machineId,
			@PathVariable("languagecode") String langCode, @PathVariable("effdatetimes") String dateAndTime) {

		return macHistoryService.getMachineHistroyIdLangEffDTime(machineId, langCode, dateAndTime);

	}

}