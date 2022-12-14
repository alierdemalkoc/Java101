package com.turkcell.TeknikServis.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.turkcell.TeknikServis.model.Proposal;
import com.turkcell.TeknikServis.model.Proposal.Status;
import com.turkcell.TeknikServis.repo.ProposalRepo;

@Service
public class ProposalService {
	private ProposalRepo proposalRepo;

	public List<Proposal> getAllByUserID(Long userId) {
		return proposalRepo.findAllByUSERID(userId);
	}
	
	public List<Proposal> getAllByStatus(Status status) {
		return proposalRepo.findAllBySTATE(status);
	}

	public List<Proposal> getAll() {
		return proposalRepo.findAll();
	}

	public void deleteById(Long id) {
		proposalRepo.deleteById(id);
	}

	public Proposal getById(Long id) {
		return proposalRepo.findById(id).get();
	}

	public Proposal save(Proposal proposal) {
		proposal.setPROPOSALDATE(new Date());
		return proposalRepo.save(proposal);
	}
	
	public Proposal respondToProposal(Long id, boolean status) {
		Proposal proposal = proposalRepo.findById(id).get();
		proposal.setSTATE(status ? Status.Accepted : Status.Denied);
		proposalRepo.save(proposal);
		return proposalRepo.findById(id).get();
	}
}
