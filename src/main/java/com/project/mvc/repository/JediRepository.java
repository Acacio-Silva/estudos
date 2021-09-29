package com.project.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.mvc.models.Jedi;

@Repository
public class JediRepository {

	public JediRepository() {
		jedi = new ArrayList<Jedi>();
		jedi.add(new Jedi("Luke","Sky"));		
	}

	
	private List<Jedi> jedi;
	
	public List<Jedi> getAllJedi(){
		
		return this.jedi;
	}

	public void add(Jedi jedi) {
		this.jedi.add(jedi);
	}

	
}
