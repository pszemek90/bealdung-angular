import { Component, OnInit } from '@angular/core';
import { User } from 'src/model/user';
import { UserServiceService } from 'src/service/user-service.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: User[];
  

  constructor(private userService: UserServiceService) { }

  ngOnInit(): void {
    this.userService.findAll().subscribe(data => {
      this.users = data;
    });
  }

}
