package br.com.mastertech.couto.oauthcontact.entity

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
class Contact {

    @Id
    @GeneratedValue
    private var id: Integer? = null

    private var name: String? = null

    private var phone: String? = null

    private var userId: Integer? = null

    private var username: String? = null

    constructor(id: Integer?, name: String?, phone: String?, userId: Integer?, username: String?) {
        this.id = id
        this.name = name
        this.phone = phone
        this.userId = userId
        this.username = username
    }
}