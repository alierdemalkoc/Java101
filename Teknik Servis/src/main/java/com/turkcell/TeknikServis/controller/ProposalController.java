package com.turkcell.TeknikServis.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.TeknikServis.model.Proposal;
import com.turkcell.TeknikServis.model.Proposal.Status;
import com.turkcell.TeknikServis.service.ProposalService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "proposal")
@AllArgsConstructor
public class ProposalController {
	
	private ProposalService proposalService;
	
	@PostMapping("/save")
	public Proposal create(@RequestBody Proposal proposal)
	{
		return proposalService.save(proposal);
	}
	
	@GetMapping("/getAll")
	public List<Proposal> getAll(){
		return proposalService.getAll();
	}
	
	@GetMapping("/getAllByUserID")
	public List<Proposal> getAllByUserID(@RequestHeader(name = "userid") Long id){
		return proposalService.getAllByUserID(id);
	}
	
	@GetMapping 
	public List<Proposal> getAllByStatus(@RequestParam(name = "status") Status status){
		return proposalService.getAllByStatus(status);
	}
	
	@GetMapping("/getByID/{id}")
	public Proposal getByID(@PathVariable(name = "id") Long id){
		return proposalService.getById(id);
	}
	
	@DeleteMapping(path = "deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable(name = "id") Long id)
	{
		proposalService.deleteById(id);
		return ResponseEntity.ok("Başarı ile silindi");
	}

	@PutMapping(path = "editStatus/{id}")
	public Proposal editStatus(@PathVariable(name = "id") Long id, @RequestHeader(name = "status") boolean status)
	{
		return proposalService.respondToProposal(id, status);
	}
	
	
	
}
