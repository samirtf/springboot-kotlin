package com.apprimority.empty.controller

import com.apprimority.empty.model.TokenClaims
import com.apprimority.empty.service.AuthService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * User endpoints, require authentication
 */
@RestController
@RequestMapping("/user")
class UserController(val authService: AuthService) {
    @GetMapping("/me")
    fun getCurrentUser(): TokenClaims {
        return authService.getClaims()
    }
}
