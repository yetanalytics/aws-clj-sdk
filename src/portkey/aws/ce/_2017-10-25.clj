(ns portkey.aws.ce.-2017-10-25 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "ce", :region "us-east-1"},
    :ssl-common-name "ce.us-east-1.amazonaws.com",
    :endpoint "https://ce.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json" protocol-version "1.1")
