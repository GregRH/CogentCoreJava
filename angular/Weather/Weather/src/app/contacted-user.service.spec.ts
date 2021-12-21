import { TestBed } from '@angular/core/testing';

import { ContactedUserService } from './contacted-user.service';

describe('ContactedUserService', () => {
  let service: ContactedUserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ContactedUserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
