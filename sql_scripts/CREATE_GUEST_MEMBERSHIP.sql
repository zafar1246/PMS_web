CREATE TABLE  GUEST_MEMBERSHIP (
	 GUEST_MEMBERSHIP_ID   INT PRIMARY KEY,
	 GUEST_PROFILE_ID   INT  NOT NULL,
	 MEMBERSHIP_ID   INT  NULL,
	 DATE_FROM   TIMESTAMP  NULL,
	 DATE_TO   TIMESTAMP  NULL,
	 IS_ACTIVE  CHAR NULL,
	 CREATED_BY   VARCHAR2 (16) NOT NULL,
	 CREATED_ON   TIMESTAMP  NOT NULL,
	 MODIFIED_BY   VARCHAR2 (16) NOT NULL,
	 MODIFIED_ON   TIMESTAMP  NOT NULL,
     CONSTRAINT GUEST_PROFILE_FK2
        FOREIGN KEY (GUEST_PROFILE_ID)
        REFERENCES GUEST_PROFILE(GUEST_PROFILE_ID),
     CONSTRAINT GUEST_MEMBERSHIP_FK
        FOREIGN KEY (MEMBERSHIP_ID)
        REFERENCES MEMBERSHIP(MEMBERSHIP_ID)
);