import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { GroupBoxComponent } from "./group-box/group-box.component";
import { CarouselComponent } from "./carousel/carousel.component";
import { DashboardComponent } from "./dashboard/dashboard.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, GroupBoxComponent, CarouselComponent, DashboardComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'grievance-redressal-portal';
}
