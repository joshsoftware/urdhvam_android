package com.joshsoftware.urdhvam.aws;

import com.amazonaws.regions.Regions;

public class AWSConstants {

    //URLs for create identity & bucket
    //https://console.aws.amazon.com/cognito/home?region=us-east-1 (Manage federated identities)
    //https://console.aws.amazon.com/iam/home?region=us-east-1#home

    public static final String COGNITO_IDENTITY_ID = "us-east-1:48a47c99-fbb9-455e-a57b-6f2f289248d3";
    public static final Regions COGNITO_REGION = Regions.US_EAST_1;

    public static final String BUCKET_NAME_STAGING = "tpn-mobile-staging";
    public static final String BUCKET_NAME_PRODUCTION = "tpn-mobile-production";

    //public static final String BUCKET_NAME = BUCKET_NAME_STAGING;



    public static final String DOCUMENT_PATH = "document";
    public static final int SOCKET_TIMEOUT = 60000;

    public static final String S3_URL = "https://s3-ap-southeast-1.amazonaws.com/";
}
