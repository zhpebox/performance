//new Vue({  
//    el:'#app',  
//    data: {  
//        message:'hello vue.js.'  
//    }  
//});  
//
//var app2 = new Vue({
//	  el: '#app-2',
//	  data: {
//	    message: '页面加载于 ' + new Date()
//// mess: 'time out out'
//	  }
//	})
//
//var app3 = new Vue({
//	  el: '#app-3',
//	  data: {
//	    seen: true
//	  }
//	})
//
//
//var app4 = new Vue({
//	  el: '#app-4',
//	  data: {
//	    todos: [
//	      { text: '学习 JavaScript' },
//	      { text: '学习 Vue' },
//	      { text: '整个牛项目' }
//	    ]
//	  }
//	})
//
//var app5 = new Vue({
//	el:'#app-5',
//	data:{
//		message:"hello world!"
//	},
//	methods:{
//		dao: function(){
//			this.message = this.message.split('').reverse().join('')
//		}
//	}
//	
//})
//
//var app6 = new Vue({
//	el:'#app-6',
//	data:{
//		message:'sd'
//	}
//})
//
//Vue.component('todo-item', {
//	  props: ['todo'],
//	  template: '<li>{{ todo.text }}</li>'
//	})
//	
//	
//var app7 = new Vue({
//  el: '#app-7',
//  data: {
//    groceryList: [
//      { text: '蔬菜' },
//      { text: '奶酪' },
//      { text: '随便其他什么人吃的东西' }
//    ]
//  }
//})
//
//Vue.component('zz',{
//	props:['user'],
//	template:'<tr><td>{{user.name}} </td><td>{{user.age}}</td></tr>'
//})
//
//var apps = new Vue({
//	el:'#apps',
//	data:{
//		items:[
//		       	{'name':'zhang','age':16},
//		       	{'name':'wang','age':18},
//		       	{'name':'li','age':13}
//		       ]
//	}
//})
//
//var appe = new Vue({
//	el:'#appe',
//	data:{
//		mw:'33'
//	}
//// methods:{
//// send:function(){
//// var vm = this
//// vm.$http.get(vm.apiUrl)
//// .then((response) => {
//// vm.$set('gridData', response.data)
//// })
//// }
//// }
//})
//
//Vue.component('yy',{
//	props:['user'],
//	template:'<li>{{user.name}} {{user.age}}</li>'
//})
//
//var appz = new Vue({
//	el:'#appz',
//	data:{
//		listy:[
//		       	{name:'zj',age:12},
//		       	{name:'zw',age:13},
//		       	{name:'zr',age:14}
//		       ]
//	}
//})
//
//Vue.component('nn',{
//	props:['user'],
//	template:'<li>{{user.uid}}  {{user.uname}} {{user.upass}}</li>'
//})
//
//Vue.component('qq',{
//	props:['userr'],
//	template:'<option>{{userr.uname}}</option>'
//})
//
//var appCall = new Vue({
//	el:'#appCalls',
//	data:{
//		backMessage:'',
//		mo:{uid:'12',uname:'hello',upass:123455},
//		sids:1,
//		slecteds:3,
//		checkStr:5,
//		checkboxModel:7
//	},
//	methods:{
//		getMessage : function(){
//			// GET /someUrl
//			  this.$http.get('/BookProject/user/getUsers/3').then(response => {
//			    // get body data
//				  this.backMessage = response.body
//			  }, response => {
//			    // error callback
//				  console.log("反馈出现问题！");
//			  });
//		},
//		getUser:function(){
//			this.$http({
//				 method:'GET',
//		            url:'/BookProject/user/getUsers',
//		            params :{'uid':1}
//			}).then(response => {
//			    this.backMessage = response.body
//			  }, response => {
//				  console.log("反馈出现问题！");
//			  });
//		},
//		subUser:function(){
//			console.log(JSON.stringify(this.mo))
//			this.$http({
//					method:'POST',
//					url:'/BookProject/user/addUsers',
//					body:{'mo':JSON.stringify(this.mo)},
//					emulateJSON:true, //允许body带接送传输
//					headers: {
//						dataType:"json", 
//						contentType:"application/json"
//                  }
//			}).then(response => {
//			    this.backMessage = response.body
//			  }, response => {
//				  console.log("反馈出现问题！");
//			  });
//		},
//		subUserPUT:function(){
//			this.$http({
//				method:'PUT',
//				url:'/BookProject/user/addUsers',
//				body:{'mo':JSON.stringify(this.mo)},
//				emulateJSON:true, //允许body带接送传输
//				headers: {
//					dataType:"json", 
//					contentType:"application/json"
//              }
//			}).then(response => {this.backMessage = response.body},
//					response => {console.log("反馈出现问题！");
//					});
//		},
//		getSelect:function(){
//			console.log(this.slecteds);
//		}
//	}
//});
//
//// data:{'websiteId':websiteid,'pageSize':pagesize,'pageNo':pageno,'isTop':0}
//
