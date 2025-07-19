
# 🧪 Angular Task: Load Products and Add to Cart

## 🎯 Objective

Create a simple Angular application where users can:
- View a list of products
- Add products to a shared shopping cart
- View the cart contents and total cost

---

## 📁 App Structure

```
src/
├── app/
│   ├── product-list/
│   │   └── product-list.component.ts/html/css
│   ├── cart/
│   │   └── cart.component.ts/html/css
│   ├── services/
│   │   ├── product.service.ts
│   │   └── cart.service.ts
│   └── models/
│       └── product.ts
```

---

## 🔧 Functional Requirements

### 1. Product List (`ProductListComponent`)
- Display a list of products.
- Each product should have:
  - Name
  - Price
  - "Add to Cart" button
- Load products using a `ProductService` (simulate with a static array or Observable).

### 2. Cart (`CartComponent`)
- Show a list of products added to the cart.
- Display:
  - Product name
  - Quantity
  - Total per item
- Show the **grand total price**.

### 3. Cart Service (`CartService`)
- Shared service to manage cart state across components.
- Store items in an internal array.
- Provide methods like:
  - `addToCart(product: Product)`
  - `getItems()`
  - `getTotal()`

---

## 📦 Data Model

`models/product.ts`

```ts
export interface Product {
  id: number;
  name: string;
  price: number;
}
```

---

## ✅ Bonus Tasks (Optional)

- Show a **toast/alert** when a product is added.
- Display **total item count** in a navbar.
- Use **RxJS BehaviorSubject** for reactive updates in `CartService`.
- Add quantity increment if a product already exists in the cart.
