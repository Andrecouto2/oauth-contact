package br.com.mastertech.couto.oauthcontact.service

import br.com.mastertech.couto.oauthcontact.entity.Contact
import br.com.mastertech.couto.oauthcontact.repository.ContactRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ContactService {

    @Autowired
    private lateinit var contactRepository: ContactRepository

    fun save(contact: Contact): Contact {
        return contactRepository.save(contact)
    }

    fun findAllByUserId(id: Integer): List<Contact> {
        return contactRepository.findAllByUserId(id)
    }
}