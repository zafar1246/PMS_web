CREATE TABLE  GUEST_PAYMENT_CARD (
	 GUEST_PAYMENT_CARD_ID   INT  PRIMARY KEY,
	 GUEST_PROFILE_ID   INT  NOT NULL,
	 PAYMENT_CARD_ID   INT  NULL,
	 IS_DEFAULT  CHAR NULL,
	 IS_ACTIVE  CHAR NULL,
	 CREATED_BY   VARCHAR2 (16) NOT NULL,
	 CREATED_ON   TIMESTAMP  NOT NULL,
	 MODIFIED_BY   VARCHAR2 (16) NOT NULL,
	 MODIFIED_ON   TIMESTAMP  NOT NULL
);