package com.http.tp.classes;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;

/**
 *
 * @author khali
 */
@Entity
@Table(name = "user")

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Enumerated(EnumType.STRING)
    @Column(name = "grade")
    private Grades grade;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "prenom")
    private String prenom;
  

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 

    public User(Integer id, String email, Grades grade, String nom, String password, String prenom,
			List<Document> documentList, List<Messages> messageList) {
		this.id = id;
		this.email = email;
		this.grade = grade;
		this.nom = nom;
		this.password = password;
		this.prenom = prenom;
	
	}

	public Grades getGrade() {
		return grade;
	}

	public void setGrade(Grades grade) {
		this.grade = grade;
	}

	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

 
    
}
