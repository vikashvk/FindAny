import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { RedirectHandlerComponent } from './redirect-handler/redirect-handler.component';
import { CustomerModule } from './customer/customer.module';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { AuthGuardService } from './services/auth-guard.service';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { LogoutComponent } from './logout/logout.component';
import { IntroComponent } from './intro/intro.component';
import { TeamsComponent } from './teams/teams.component';
import { AboutComponent } from './about/about.component';
import { ResetPasswordComponent } from './reset-password/reset-password.component';
import { AdminProductListComponent } from './admin-product-list/admin-product-list.component';
import { AddProductComponent } from './add-product/add-product.component';
import { CustomerRegestrationComponent } from './customer-regestration/customer-regestration.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { ShopproductComponent } from './shopproduct/shopproduct.component';
import { AdminupdateproductComponent } from './adminupdateproduct/adminupdateproduct.component';


const routes: Routes = [
  {
    path: '', redirectTo: '/home', pathMatch: 'full'
  },
  {
    path: 'home', component: HomeComponent
  },
  {
    path: 'update', component: AdminupdateproductComponent
  },
  {
    path: 'ourIntro', component: IntroComponent

  },
  {
    path: 'shop', component: ShopproductComponent
  },
  {
    path: 'ourTeam', component: TeamsComponent
  },
  {
    path: 'ourAbout', component: AboutComponent
  },
  {
    path: 'admin', component: AdminComponent
  },
  {
    path: 'adminp', component: AdminpageComponent
  },
  {
    path: 'login', component: CustomerLoginComponent
  },

  {
    path: 'reset-password', component: ResetPasswordComponent
  },


  {
    path: 'register', component: CustomerRegestrationComponent
  },
  {
    path: 'oauth2-redirect', component: RedirectHandlerComponent
  },
  {
    path: 'logout', component: LogoutComponent
  },
  {
    path: 'adminProductList', component: AdminProductListComponent
  },
  {
    path: 'addProductList', component: AddProductComponent
  },
  {
    path: 'user'
    , loadChildren: () => import('./customer/customer.module').then(m => m.CustomerModule)
    , canActivateChild: [AuthGuardService]
  },

  {
    path: '**', component: PageNotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
