package com.joshsoftware.urdhvam.aws;

import com.amazonaws.regions.Regions;

public class AWSConstants {

    //URLs for create identity & bucket
    //https://console.aws.amazon.com/cognito/home?region=us-east-1 (Manage federated identities)
    //https://console.aws.amazon.com/iam/home?region=us-east-1#home

    public static final String COGNITO_IDENTITY_ID = "ap-south-1:73ecfafc-25c0-4ea9-b4fb-ec5c324036fc";
    public static final Regions COGNITO_REGION = Regions.AP_SOUTH_1;

    //public static final String BUCKET_NAME_STAGING = "tpn-mobile-staging";
    public static final String BUCKET_NAME_PRODUCTION = "urdhvam-stage";
    public static final String FOLDER_AUDIO = "audio/";

    //public static final String BUCKET_NAME = BUCKET_NAME_STAGING;



    public static final int SOCKET_TIMEOUT = 60000;

    public static final String S3_URL = "https://s3.ap-south-1.amazonaws.com/";
}
