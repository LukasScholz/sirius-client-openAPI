=begin
#SIRIUS Nightsky API

#REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.

OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.35
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::AnnotatedSpectrum
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AnnotatedSpectrum' do
  before do
    # run before each test
    @instance = SwaggerClient::AnnotatedSpectrum.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AnnotatedSpectrum' do
    it 'should create an instance of AnnotatedSpectrum' do
      expect(@instance).to be_instance_of(SwaggerClient::AnnotatedSpectrum)
    end
  end
  describe 'test attribute "ms_level"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "collision_energy"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "peaks"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
