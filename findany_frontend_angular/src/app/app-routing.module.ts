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
//import { BillviewComponent } from './billview/billview.component';
import { AdminProductListComponent } from './admin-product-list/admin-product-list.component';
import { AdminAddProductComponent } from './admin-add-product/admin-add-product.component';


const routes: Routes = [
  {
    path: '', redirectTo: '/home', pathMatch: 'full'
  },
  {
    path: 'home', component: HomeComponent
  },
  {
    path: 'ourIntro', component: IntroComponent
    
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
    path: 'login', component: UserLoginComponent
  },
  
  {
    path: 'reset-password', component: ResetPasswordComponent
  },


  {
    path: 'register', component: UserRegistrationComponent
  },
  {
    path: 'oauth2-redirect', component: RedirectHandlerComponent
  },
  {
    path: 'logout', component: LogoutComponent
  },
  {
    path:'adminProductList',component:AdminProductListComponent
  },
  {
    path:'adminAddProduct',component:AdminAddProductComponent
  },

  {
    path: 'user'
    , loadChildren: () => import('./customer/customer.module').then(m => m.CustomerModule)
    , canActivateChild:[AuthGuardService]
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
