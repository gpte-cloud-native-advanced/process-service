package com.redhat.cajun.navy.process.pact;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;

import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit.PactProviderRule;
import au.com.dius.pact.consumer.junit.PactVerification;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;

public class ResponderServicePactContracts {

    @Rule
    public PactProviderRule provider = new PactProviderRule("responder-service", "localhost", 0, this);

    @Pact(provider = "responder-service", consumer = "process-service")
    public RequestResponsePact availableResponders(PactDslWithProvider builder) {
        return builder.given("Available responders")
                .uponReceiving("A request for available responders")
                .method("GET")
                .path("/responders/available")
                .query("limit=100")
                .willRespondWith()
                .status(200)
                .headers(Collections.singletonMap("Content-Type", "application/json"))
                .body(io.pactfoundation.consumer.dsl.LambdaDsl.newJsonArrayMaxLike(100, (a) -> a.object((o) -> {
                    o.stringType("id", "1");
                    o.numberType("latitude", new BigDecimal("30.12345").doubleValue());
                    o.numberType("longitude", new BigDecimal("-70.98765").doubleValue());
                    o.numberType("boatCapacity", 10);
                    o.booleanType("medicalKit");
                    o.booleanType("person");
                })).build())
                .toPact();
    }

    @Test
    @PactVerification(value = "responder-service", fragment = "availableResponders")
    public void testAvailableResponders() throws IOException {

        HttpResponse httpResponse = Request.Get(provider.getUrl() + "/responders/available?limit=100")
                .execute().returnResponse();
        MatcherAssert.assertThat(httpResponse.getStatusLine().getStatusCode(), CoreMatchers.equalTo(200));
    }

}
