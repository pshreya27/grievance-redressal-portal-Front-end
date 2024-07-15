import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { GroupBoxComponent } from './app/group-box/group-box.component';

bootstrapApplication(AppComponent, appConfig)
  .catch((err) => console.error(err));
  
