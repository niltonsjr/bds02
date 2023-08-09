package com.devsuperior.bds02.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

  private static final long serialVersionUID = -9079296538L;

  public ResourceNotFoundException(String msg) {
    super(msg);
  }
}
