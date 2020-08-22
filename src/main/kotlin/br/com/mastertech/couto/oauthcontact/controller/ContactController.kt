package br.com.mastertech.couto.oauthcontact.controller

import br.com.mastertech.couto.oauthcontact.entity.Contact
import br.com.mastertech.couto.oauthcontact.models.ContactModel
import br.com.mastertech.couto.oauthcontact.models.UserModel
import br.com.mastertech.couto.oauthcontact.service.ContactService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/contacts")
class ContactController {

    @Autowired
    private lateinit var contactService: ContactService

    @PostMapping
    fun save(@RequestBody contactModel: ContactModel, @AuthenticationPrincipal userModel: UserModel): ResponseEntity<Contact> {
        val contact = Contact(null, contactModel.name, contactModel.phone, userModel.id, userModel.name)
        return ResponseEntity.status(HttpStatus.CREATED).body(contactService.save(contact))
    }

    @GetMapping
    fun getContacts(@AuthenticationPrincipal userModel: UserModel): ResponseEntity<List<Contact>> {
        return ResponseEntity.status(HttpStatus.OK).body(contactService.findAllByUserId(userModel.id))
    }
}