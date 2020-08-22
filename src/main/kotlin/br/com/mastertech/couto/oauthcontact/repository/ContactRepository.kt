package br.com.mastertech.couto.oauthcontact.repository

import br.com.mastertech.couto.oauthcontact.entity.Contact
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository : CrudRepository<Contact, Integer> {
    fun findAllByUserId(id: Integer): List<Contact>
}

