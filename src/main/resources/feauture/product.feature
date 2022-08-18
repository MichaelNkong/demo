Feature: product by id
Scenario: get prodect with a valid id

When customer calls the product with id 22
Then the customer recieves status code of 200
And the response should contain:
"""
{"id":"22","name":"Samsung Gelaxy","description":"The best model now","price":400.0,"seller":"John Smith"}
"""