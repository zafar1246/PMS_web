package com.omaisss.pms.restservices;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
//import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Service	
public class JWTService {
	
	private RSAPrivateKey privateKey;
	private RSAPublicKey publicKey;
	private long expirationTime =  1800000;
	
	@PostConstruct
	private void initKeys() throws NoSuchAlgorithmException {
		KeyPairGenerator generator =  KeyPairGenerator.getInstance("RSA");
		generator.initialize(2048);
		KeyPair keyPair = generator.generateKeyPair();
		privateKey =  (RSAPrivateKey) keyPair.getPrivate();
		publicKey = (RSAPublicKey) keyPair.getPublic();
	}
	public String generateToken(String userName, String role) {
		return JWT.create()
		.withClaim("userName", userName)
		.withClaim("role", role)
		.withClaim("expirationTime", new Date(System.currentTimeMillis() + expirationTime))
		.sign(Algorithm.RSA256(publicKey, privateKey));
		
		
	}

}
