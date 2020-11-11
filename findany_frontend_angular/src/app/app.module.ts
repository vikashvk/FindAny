import { BrowserModule } from '@angular/platform-browser';
import { NgModule, ErrorHandler } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationbarComponent } from './navigationbar/navigationbar.component';
import { HeaderComponent } from './header/header.component';
import { IntroComponent } from './intro/intro.component';
import { TeamsComponent } from './teams/teams.component';
import { AboutComponent } from './about/about.component';
import { FooterComponent } from './footer/footer.component';
import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { TokenInterceptorService } from './services/token-interceptor.service';
import { UserLoginComponent } from './user-login/user-login.component';
import { API_BASE_URL, GOOGLE_AUTH_URL, FACEBOOK_AUTH_URL } from '../constants';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ToastrModule, ToastrService } from 'ngx-toastr';
import { RedirectHandlerComponent } from './redirect-handler/redirect-handler.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { IonicModule } from '@ionic/angular';
import { LogoutComponent } from './logout/logout.component';
import { ResetPasswordComponent } from './reset-password/reset-password.component';
import { ServicefindAnyComponent } from './servicefind-any/servicefind-any.component';
import { AdminProductListComponent } from './admin-product-list/admin-product-list.component';
import { AdminAddProductComponent } from './admin-add-product/admin-add-product.component';
@NgModule({
  declarations: [
    AppComponent,
    NavigationbarComponent,
    HeaderComponent,
    IntroComponent,
    TeamsComponent,
    AboutComponent,
    FooterComponent,
    AdminComponent,
    HomeComponent,
    AdminpageComponent, UserLoginComponent, RedirectHandlerComponent, UserRegistrationComponent, PageNotFoundComponent, LogoutComponent, ResetPasswordComponent, ServicefindAnyComponent, AdminProductListComponent, AdminAddProductComponent,

  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule,
    IonicModule
  ],
  providers: [{ provide: 'API_URL', useValue: API_BASE_URL }, { provide: 'GOOGLE_AUTH_URL', useValue: GOOGLE_AUTH_URL }, { provide: 'FACEBOOK_AUTH_URL', useValue: FACEBOOK_AUTH_URL },
    {
    provide: HTTP_INTERCEPTORS,
    useClass: TokenInterceptorService,
    multi: true
  }, ToastrService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
