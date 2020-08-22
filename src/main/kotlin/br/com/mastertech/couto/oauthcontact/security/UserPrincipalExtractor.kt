package br.com.mastertech.couto.oauthcontact.security

import br.com.mastertech.couto.oauthcontact.models.UserModel

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor

class UserPrincipalExtractor : PrincipalExtractor {
    override fun extractPrincipal(map: Map<String, Any>): Any {
        return UserModel(map["id"] as Integer, map["name"] as String)
    }
}