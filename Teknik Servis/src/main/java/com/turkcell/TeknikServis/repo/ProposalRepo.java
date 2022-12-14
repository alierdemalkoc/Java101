package com.turkcell.TeknikServis.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkcell.TeknikServis.model.Proposal;
import com.turkcell.TeknikServis.model.Proposal.Status;

@Repository
public interface ProposalRepo extends JpaRepository<Proposal, Long>{

	public List<Proposal> findAllByUSERID(Long id);
	
	public List<Proposal> findAllBySTATE(Status state);
	
}
